package Logical;

public class Remove_Special_Charecter {

	public static void main(String[] args) {
		String A="velocity$training";
		System.out.println(A.replace("$", ""));
		String b="velo@&ciTY";
		System.out.println(b.replaceAll("[^a-zA-Z@]", ""));//^ means not in range

	}

}
