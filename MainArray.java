import java.util.ArrayList;

class MainArray{
	public static void main(String args[]){
		ArrayList<String> colours=new ArrayList<>();
		colours.add("Violet");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Indigo");
		colours.add("Turquoise");
		
		System.out.println("Array list of colours: ");
		
		/*for(int i=0;i<colours.size();i++){
			System.out.println(colours.get(i));
		}*/
		for(String s: colours){
			System.out.println(s);
		}
		
	}
}