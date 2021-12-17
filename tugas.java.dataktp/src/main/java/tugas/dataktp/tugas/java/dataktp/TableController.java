/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.dataktp.tugas.java.dataktp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class TableController {
    
  @RequestMapping("/dataktp")
       //@ResponseBody
       public String getTable(Model isi){
           String result ="Data KTP";
           isi.addAttribute("expedisi", result);
           
          // DataKtp data = new DataKtp();
         ArrayList<List<String>> data = new ArrayList<>();
           data.add(0,Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
           data.add(1,Arrays.asList("1","2020013010","Naufal","Yogyakarta"));
           data.add(2,Arrays.asList("2","2020013011","Gita","Surabaya"));
           data.add(3,Arrays.asList("3","2020013012","Mahar","Jakarta"));
           data.add(4,Arrays.asList("4","2020013013","Dika","Malang"));
           data.add(5,Arrays.asList("5","2020013014","Wira","Jogja"));
           data.add(6,Arrays.asList("6","2020013015","Dimas","Palembang"));
           data.add(7,Arrays.asList("7","2020013016","Alam","Bandung"));
           data.add(8,Arrays.asList("8","2020013017","Nourin","Malang"));
           data.add(9,Arrays.asList("9","2020013018","Muhammad","Bali"));
           data.add(10,Arrays.asList("10","2020013019","Athallariq","Lombok"));
           data.add(11,Arrays.asList("11","2020013020","Tama","Bima"));
           data.add(12,Arrays.asList("12","2020013021","Maulana","Sumbawa"));
           data.add(13,Arrays.asList("13","2020013022","Alfiansyah","Depok"));
           data.add(14,Arrays.asList("14","2020013023","Aditya","Tangerang"));
           data.add(15,Arrays.asList("15","2020013024","Pratama","Bekasi"));
           data.add(16,Arrays.asList("16","2020013025","Adzani","Padang"));
           data.add(17,Arrays.asList("17","2020013026","Ari","Wonosobo"));
           data.add(18,Arrays.asList("18","2020013027","Reza","Kulon Progo"));
           data.add(19,Arrays.asList("19","2020013028","Atta","Bantul"));
           data.add(20,Arrays.asList("20","2020013029","Prasetyo","Sragen"));
           
           
           isi.addAttribute("tabel",data);
           
           return "tableviewer";
       }
}
