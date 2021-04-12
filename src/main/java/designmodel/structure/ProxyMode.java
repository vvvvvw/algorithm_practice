package designmodel.structure;

public class ProxyMode {

    public static class RealVisitor{
        public void visit(){

        }
    }

    public static class VisitorProxy{
        RealVisitor visitor = new RealVisitor();
        public void visit(){
            securityVerify();
            visitor.visit();
        }

        private void securityVerify() {
        }

    }
}
