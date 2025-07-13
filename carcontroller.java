package com.bala.two;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apc")
public class carcontroller {
    private List<Myclass> carList =new ArrayList<>();
    @PostMapping("/add")
    public String addcar(@RequestParam String brand,@RequestParam String model,@RequestParam int year ) {
        Myclass car = new Myclass(brand, model, year);
        carList.add(car);

        return "car added Successfully";
    }
    @GetMapping("/all")
    public List<Myclass> getallcars(){
        return carList;
    }
    @GetMapping("/{index}")
    public  String getcar(@PathVariable int index){
        if(index < carList.size()){
            return carList.get(index).getcar();
        }
        return "car not found";
    }
    @PutMapping("/update/{index}")
    public String updatecar( @PathVariable int index,@RequestParam String brand,@RequestParam String model,@RequestParam int year){
        if(index < carList.size()){
            Myclass car=new Myclass();
            car.setBrand(brand);
            car.setModel(model);
            car.setYear(year);
            return "car updated Successfully";

        }
        return "car not found";
    }
    @DeleteMapping("/delete/{index}")
    public String deletecar(@PathVariable int index) {
        if (index < carList.size()) {
            carList.remove(index);
            return "car deleted successfully";
        }
        return "car not found";

    }
    }


