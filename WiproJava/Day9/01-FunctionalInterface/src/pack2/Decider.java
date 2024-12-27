package pack2;

@FunctionalInterface
public interface Decider<T>{
	boolean decide(T obj);

}
