package friendlist;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class GetTroopAppointRemarkReq
  extends JceStruct
{
  static ArrayList cache_vecUinList;
  public long GroupCode;
  public long GroupUin;
  public byte cRichInfo;
  public long uin;
  public ArrayList vecUinList;
  
  public GetTroopAppointRemarkReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public GetTroopAppointRemarkReq(long paramLong1, long paramLong2, long paramLong3, ArrayList paramArrayList, byte paramByte)
  {
    this.uin = paramLong1;
    this.GroupCode = paramLong2;
    this.GroupUin = paramLong3;
    this.vecUinList = paramArrayList;
    this.cRichInfo = paramByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
    this.GroupCode = paramJceInputStream.read(this.GroupCode, 1, true);
    this.GroupUin = paramJceInputStream.read(this.GroupUin, 3, true);
    if (cache_vecUinList == null)
    {
      cache_vecUinList = new ArrayList();
      cache_vecUinList.add(Long.valueOf(0L));
    }
    this.vecUinList = ((ArrayList)paramJceInputStream.read(cache_vecUinList, 4, true));
    this.cRichInfo = paramJceInputStream.read(this.cRichInfo, 5, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    paramJceOutputStream.write(this.GroupCode, 1);
    paramJceOutputStream.write(this.GroupUin, 3);
    paramJceOutputStream.write(this.vecUinList, 4);
    paramJceOutputStream.write(this.cRichInfo, 5);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\friendlist\GetTroopAppointRemarkReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */