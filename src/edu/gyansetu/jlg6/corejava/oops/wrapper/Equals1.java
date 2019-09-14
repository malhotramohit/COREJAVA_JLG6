package edu.gyansetu.jlg6.corejava.oops.wrapper;


class Network{
	
}
class Server {

	private int id;
	private double space;
	
	Network net;

	public Server(int id, double space) {
		super();
		this.id = id;
		this.space = space;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((net == null) ? 0 : net.hashCode());
		long temp;
		temp = Double.doubleToLongBits(space);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Server other = (Server) obj;
		if (id != other.id)
			return false;
		if (net == null) {
			if (other.net != null)
				return false;
		} else if (!net.equals(other.net))
			return false;
		if (Double.doubleToLongBits(space) != Double.doubleToLongBits(other.space))
			return false;
		return true;
	}

	
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (obj.getClass()== Server.class) {
//			Server s = (Server) obj;
//			if (s == obj) {
//				return true;
//			} else if (s.id == this.id && s.space == this.space) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
//	}

}

public class Equals1 {

	public static void main(String[] args) {

		// fe
		Server server1 = new Server(1, 23.88);

		// db
		Server server2 = new Server(1, 23.88);

		if (server1.equals(server2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}
