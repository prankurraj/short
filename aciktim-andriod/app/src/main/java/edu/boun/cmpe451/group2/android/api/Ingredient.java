package edu.boun.cmpe451.group2.android.api;


public class Ingredient {

    public Long id = null;
    public String name = "";
    public double protein = 0;
    public double fat = 0;
    public double carbohydrate = 0;
    public double calories = 0;
    public String unitName = "";

    /*public List<Ingredient> getIngredients() {
        List<Ingredient> allIngredients = null;
        List<Map<String, Object>> ingredients = ingDao.getAllIngredients();
        for(int i = 0; i < ingredients.size(); i ++) {
            Ingredient tempIng = null;
            tempIng.id = Long.parseLong(ingredients.get(i).get("id").toString());
            tempIng.name = ingredients.get(i).get("name").toString();
            tempIng.protein = Double.parseDouble(ingredients.get(i).get("protein").toString());
            tempIng.fat = Double.parseDouble(ingredients.get(i).get("fat").toString());
            tempIng.carbohydrate = Double.parseDouble(ingredients.get(i).get("carbonhydrate").toString());
            tempIng.calories = Long.parseLong(ingredients.get(i).get("calories").toString());
            tempIng.unitName = ingredients.get(i).get("unitName").toString();
            allIngredients.add(tempIng);
        }
        return allIngredients;
    }*/
}