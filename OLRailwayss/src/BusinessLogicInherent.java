
public class BusinessLogicInherent extends BusinessLogic {
    
     public int singleBusiness()
        {
            int Total;
            int SubTotal=1800;
            int Tax=300+1000;
            return   Total=SubTotal+Tax;
        }
        public int ReturnBusiness()
        {
            int Total;
            int SubTotal=1800*2;
            int Tax=300*2+1000;
            return   Total=SubTotal+Tax;
        }
        
        public int Single_ChildrenBusiness()
        {
            int Total;
            int SubTotal=1800*2;
            int Tax=300+1000;
            return   Total=SubTotal+Tax;
        }
        
        public int Return_ChildrenBusiness()
        {
            int Total;
            int SubTotal=1800*4;
            int Tax=600+1000;
            return   Total=SubTotal+Tax;
        }
    
}
