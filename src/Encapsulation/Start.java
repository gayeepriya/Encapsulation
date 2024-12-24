package Encapsulation;

class Start {
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.setName("Tommy");
		d.setColor("Black");
		d.setCost(10000);
		d.setAge(12);
		d.setBreed("Shitzu");
		
		System.out.println("Name:"+d.getName());
		System.out.println("Color:"+d.getColor());
		System.out.println("Age:"+d.getCost());
		System.out.println("Cost:"+d.getAge());
		System.out.println("Breed:"+d.getBreed());
	}

}
