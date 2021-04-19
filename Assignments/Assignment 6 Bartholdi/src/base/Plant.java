package base;

class Plant extends Main{
    private boolean needWatering;
    private String plantFamily;
    private String Name;



    public Plant(boolean needWatering, String plantFamily, String Name){
        this.needWatering = needWatering;
        this.plantFamily = plantFamily;
        this.Name = Name;
    }

    public static void wateringInstruction(){
        System.out.println("Water the plant three times a day");
    }

    public static void sunlightRequirements(){
        System.out.print("The plant needs to be in direct sunlight for 8-12 hours a day");
    }
}