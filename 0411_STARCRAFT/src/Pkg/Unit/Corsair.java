package Pkg.Unit;

import Pkg.Common.*;
public class Corsair extends Airplane implements IProtoss{

		
		public Corsair() {
			super();
		}
		public Corsair(int offense) {
			this.offense=offense;
			this.heath=40;
			//this.unitKind=UnitKind.Protoss;
		}
		
		@Override
		public void fly() { //날아간다.
			System.out.println(name+"이 날아갑니다.");
		}
		
		//어택유닛공격력:  피해유닛현재체력:
		//어택유닛이 피해유닛을공격
		//피해유닛현재체력:
		@Override
		public void shotGun(Object attackUnit, Object victimUnit) {  //총을쏜다. 총을 쏘는 상대가 Mutal이면 공격력 2배로 적용
			if(victimUnit instanceof IZerg && victimUnit instanceof Airplane)
			{
				((Airplane)attackUnit).offense=((Airplane)attackUnit).offense*2;
				System.out.println(((Airplane)attackUnit).name+"공격력:"+((Airplane)attackUnit).offense+"  "+((Airplane)victimUnit).name+"현재체력:"+((Airplane)victimUnit).heath);
				System.out.println(((Airplane)attackUnit).name+"이"+((Airplane)victimUnit).name+"을 공격"+((Airplane)attackUnit).offense);
				((Airplane)victimUnit).heath=((Airplane)victimUnit).heath-((Airplane)attackUnit).offense;
				System.out.println(((Airplane)victimUnit).name+"의 체력"+((Airplane)victimUnit).heath);
				if(this.heath<=0) {
					((Airplane)victimUnit).fall(victimUnit);
				}
			}
			else {
				if(victimUnit instanceof Unit) {
					System.out.println(((Airplane)attackUnit).name+"공격력:"+((Airplane)attackUnit).offense+"  "+((Unit)victimUnit).name+"현재체력:"+((Unit)victimUnit).heath);
					System.out.println(((Airplane)attackUnit).name+"가 "+((Unit)victimUnit).name+"을 공격");
					((Unit)victimUnit).heath=((Unit)victimUnit).heath-((Airplane)attackUnit).offense;
					System.out.println(((Unit)victimUnit).name+"의 현재체력: "+((Unit)victimUnit).heath);
					if(this.heath<=0) {
						((Airplane)victimUnit).fall(victimUnit);
					}
				}
				else if(victimUnit instanceof Transport) {
					System.out.println(((Airplane)attackUnit).name+"공격력:"+((Airplane)attackUnit).offense+"  "+((Transport)victimUnit).name+"현재체력:"+((Transport)victimUnit).heath);
					System.out.println(((Airplane)attackUnit).name+"가 "+((Transport)victimUnit).name+"을 공격");
					((Transport)victimUnit).heath=((Transport)victimUnit).heath-((Airplane)attackUnit).offense;
					System.out.println(((Transport)victimUnit).name+"의 현재체력: "+((Transport)victimUnit).heath);
					if(this.heath<=0) {
						((Airplane)victimUnit).fall(victimUnit);
					}
				}
			}
		}
		@Override
		public void fall(Object fallUnit) { //추락한다.
			
			System.out.println(name+"이 추락합니다.");
			
		}
	}

