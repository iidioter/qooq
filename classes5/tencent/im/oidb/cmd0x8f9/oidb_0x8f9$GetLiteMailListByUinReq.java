package tencent.im.oidb.cmd0x8f9;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x8f9$GetLiteMailListByUinReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 34 }, new String[] { "uint32_end_time", "rpt_msg_litemail_list", "uint32_amount", "msg_filter" }, new Object[] { Integer.valueOf(0), null, Integer.valueOf(0), null }, GetLiteMailListByUinReq.class);
  public oidb_0x8f9.LiteMailFilter msg_filter = new oidb_0x8f9.LiteMailFilter();
  public final PBRepeatMessageField rpt_msg_litemail_list = PBField.initRepeatMessage(oidb_0x8f9.LiteMailBrief.class);
  public final PBUInt32Field uint32_amount = PBField.initUInt32(0);
  public final PBUInt32Field uint32_end_time = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x8f9\oidb_0x8f9$GetLiteMailListByUinReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */