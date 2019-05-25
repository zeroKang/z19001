package org.zerock.admin.domain;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data
public class Member {

  private String uid;
  
  private String upw;
  
  private String uname;
  
  private Timestamp regdate;
  private Timestamp updatedate;
  
  private List<MemberRole> roles;

}
