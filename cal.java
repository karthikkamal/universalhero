import java.rmi.*;
public interface cal extends Remote{
	public int add(int s,int s1)throws RemoteException;
	public int sub(int s,int s1)throws RemoteException;
	public int mul(int s,int s1)throws RemoteException;
	public int div(int s,int s1)throws RemoteException;

}