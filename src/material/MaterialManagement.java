package material;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManagement {
    private List<Material> materialList;
    public MaterialManagement(){
        materialList = new ArrayList<>();
    }
    public void addMaterial(Material material){
        materialList.add(material);
    }
    public Material materialSearch(int id){
        for (Material material:materialList){
            if(material.getId() == id){
                return material;
            }
        } return null;
    }
    public void editList(Material material1){
        for (int i = 0;i<materialList.size();i++){
            Material material = materialList.get(i);
            if (material.getId()==(material1.getId())){
                materialList.set(i,material1);
            }
        }
    }
    public void deleteMaterial(int id){
        for (int i =0;i<materialList.size();i++){
            Material material = materialList.get(i);
            if (material.getId()== material.id){
                materialList.remove(i);
            }
        }
    }
    public double getTotalDiscountPrice(){
        int totalDiscountPrice = 0;
        for (Material material: materialList){
            totalDiscountPrice += material.getRealMoney();
        }return totalDiscountPrice;
    }
    public double getTotalprice(){
        int totalPrice = 0;
        for (Material material:materialList){
            totalPrice += material.getAmount();
        }return totalPrice;
    }
    public List<Material> getMaterialList(){
        return materialList;
    }

    public static void main(String[] args) {
        MaterialManagement materialManagement = new MaterialManagement();
        for (int i = 0;i<5;i++){
            CrispyFlour crispyFlour = new CrispyFlour(i+5,"crispyFlour"+i,LocalDate.of(2023,4,1),8000,10);
            Meat meat = new Meat(i,"meat"+i,LocalDate.of(2023,4,1),16000,10);
            materialManagement.addMaterial(crispyFlour);
            materialManagement.addMaterial(meat);
        }
        System.out.println(materialManagement.getTotalDiscountPrice());
        System.out.println(materialManagement.getTotalprice());
        System.out.println(materialManagement.getMaterialList().toString());
    }
}
