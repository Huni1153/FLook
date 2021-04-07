package Manager;

import DAO.NicenessDAO;
import VO.NicenessVO;

public class NicenessManager { 
	private NicenessDAO nicenessDAO;
	public NicenessManager()
	{
		nicenessDAO=NicenessDAO.getInstance();
	}
	public int changeNiceness(String userCode,String postCode)
	{
		if(nicenessDAO.searchNiceness(userCode, postCode)==null)
		{
			return nicenessDAO.insertNiceness(userCode, postCode);
		}
		else
		{
			return nicenessDAO.deleteNiceness(userCode, postCode);
		}
	}
	public int insertNiceness(String userCode,String postCode)
	{ 
		return nicenessDAO.insertNiceness(userCode, postCode);
	}
	public int deleteNiceness(String userCode,String postCode)
	{
		return nicenessDAO.deleteNiceness(userCode, postCode);
	}
	public NicenessVO searchNiceness(String userCode,String postCode)
	{
		return nicenessDAO.searchNiceness(userCode, postCode);
	}
}
