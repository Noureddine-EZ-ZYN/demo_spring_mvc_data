package net.noureddine.demo_mvc.web;
import net.noureddine.demo_mvc.entities.Product;
import net.noureddine.demo_mvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping(path= "/index")
    public  String index(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList",productList);
        return "product";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }
}
