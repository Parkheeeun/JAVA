package Pkg.Unit;

import Pkg.Common.IZerg;
public class Mutal extends Airplane implements IZerg{

	
		//private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public Mutal() {
			super();
		}
		public Mutal(int offense) {
			this.offense=offense;
			this.heath=40;
			//this.unitKind=UnitKind.Zerg;
		}
		
		
		@Override
		public void fly() { //날아간다.
			System.out.println(name+"이 날아갑니다.");
		}
		@Override
		public void shotGun(Object attackUnit, Object victimUnit) { //총을쏜다.  //공중유닛은 지상유닛을 공격할수있지만 지상유닛은 공중유닛을 공격할수없다.
			//if(attackUnit instanceof IZerg && attackUnit instanceof Unit) { //지상유닛은 공중유닛을 공격할수없다.
			//if(victimUnit!=attackUnit)
			if(victimUnit instanceof IZerg==false ){ //피해자가 저그가 아니면 실행
				if(victimUnit instanceof Unit) {
			System.out.println(((Airplane)attackUnit).name+"이"+((Unit)victimUnit).name+"을 공격");
			((Unit)victimUnit).heath=((Unit)victimUnit).heath-((Airplane)attackUnit).offense;
			System.out.println(((Unit)victimUnit).name+"의 체력: "+((Unit)victimUnit).heath);
					if(this.heath<=0) {
						((Airplane)victimUnit).fall(victimUnit);
					}
				}
				else if(victimUnit instanceof Transport) {
					System.out.println(((Airplane)attackUnit).name+"이"+((Transport)victimUnit).name+"을 공격");
					((Transport)victimUnit).heath=((Transport)victimUnit).heath-((Airplane)attackUnit).offense;
					System.out.println(((Transport)victimUnit).name+"의 체력: "+((Transport)victimUnit).heath);
					if(this.heath<=0) {
						((Airplane)victimUnit).fall(victimUnit);
					}
				}
			}
			else {
				System.out.println("공격실패(같은종족을 공격할수없습니다.)");
			}
		}
		@Override
		public void fall(Object fallUnit) { //추락한다.
			System.out.println(name+"이 추락합니다.");
		}
	}


