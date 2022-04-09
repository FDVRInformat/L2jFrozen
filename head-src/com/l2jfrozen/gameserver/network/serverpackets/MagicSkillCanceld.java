package com.l2jfrozen.gameserver.network.serverpackets;

/**
 * This class ...
 * @version $Revision: 1.2.2.1.2.3 $ $Date: 2005/03/27 15:29:57 $
 */
public class MagicSkillCanceld extends L2GameServerPacket
{
	private final int objectId;
	
	public MagicSkillCanceld(final int objectId)
	{
		this.objectId = objectId;
	}
	
	@Override
	protected final void writeImpl()
	{
		writeC(0x49);
		writeD(objectId);
	}
	
	@Override
	public String getType()
	{
		return "[S] 49 MagicSkillCanceld";
	}
}
