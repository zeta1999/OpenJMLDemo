package openjml.demo;


public class Types {
	
	
	public void types3(java.util.List<Integer> a) {
		/*@ nullable */ Integer i = a.get(0);
		//@ assert false;
	}
		
	public void types2(java.util.List<Integer> a) {
		//@ ghost boolean b1 = (\lbl A \type(Integer) <: \type(Number));
		//@ ghost boolean b2 = (\lbl B \type(java.util.ArrayList<Integer>) <: \type(java.util.List<Integer>));
		//@ ghost boolean b3 = (\lbl C \type(java.util.ArrayList<Integer>) <: \type(java.util.List<Number>));
		//@ ghost boolean b4 = (\lbl D \type(java.util.ArrayList<Integer>) <: \type(java.util.List<?>));
		//@ ghost boolean b5 = (\lbl E \type(java.util.ArrayList) <: \type(java.util.List));
	}
		
	public void types(java.util.List<?> a) {
		//@ assume \typeof(a) == \type(java.util.List<Integer>);
		/*@ nullable */ Integer i = (Integer)a.get(0);
		//@ assert false;
	}
		
		
}
