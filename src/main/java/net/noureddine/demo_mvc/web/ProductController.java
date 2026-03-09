package net.noureddine.demo_mvc.web;
import net.noureddine.demo_mvc.entities.Product;
import net.noureddine.demo_mvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name="page", defaultValue="0") int page,
                        @RequestParam(name="size", defaultValue="5") int size,
                        @RequestParam(name="keyword", defaultValue="") String keyword){

        Page<Product> pageProducts;

        if(keyword.equals("")){
            pageProducts = productRepository.findAll(PageRequest.of(page, size));
        }else{
            pageProducts =  productRepository.findByNameContains(keyword, PageRequest.of(page,size));
        }

        model.addAttribute("productList", pageProducts.getContent());
        model.addAttribute("pages", new int[pageProducts.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", keyword);

        return "index";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(name="id") Long id){
        Product product = productRepository.findById(id).get();
        model.addAttribute("product", product);
        return "editProduct";
    }

    @PostMapping("/update")
    public String update(Product product){
        productRepository.save(product);
        return "redirect:/index";
    }
    @PostMapping("/save")
    public String save (Product product){
        productRepository.save(product);
        return "redirect:/index";
    }
    @GetMapping("/new")
    public String newProductForm(Model model){
        model.addAttribute("product", new Product());
        return "newProduct";
    }


}
