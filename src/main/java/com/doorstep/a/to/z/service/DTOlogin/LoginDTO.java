package com.doorstep.a.to.z.service.DTOlogin;



public class LoginDTO {
		private String usertype;
		private String email;
		public String getUsertype() {
			return usertype;
		}
		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		private String password;
}
