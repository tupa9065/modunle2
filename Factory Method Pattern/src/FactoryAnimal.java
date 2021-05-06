public class FactoryAnimal {
    public Animal getAnimal(String type){
        try{
            if("dog".equals(type)){
                return new Dog();
            }else if("cat".equals(type)){
                return new Cat();
            }
        }catch (Exception e){
            e.printStackTrace();

        }
        return null;
    }
}
