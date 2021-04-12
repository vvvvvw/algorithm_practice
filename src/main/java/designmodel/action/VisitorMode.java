package designmodel.action;

public class VisitorMode {

    public interface DataVisitor{
        public void visit(Table table);
        public void visit(Xml xml);
    }

    public class ConcretDataVisitor implements DataVisitor{

        @Override
        public void visit(Table table) {
            System.out.printf("visit table");
        }

        @Override
        public void visit(Xml xml) {
            System.out.printf("visit ");
        }
    }

    public static interface Data{

        public void accept(DataVisitor dataVisitor);
    }

    public static class Table implements Data{

        @Override
        public void accept(DataVisitor dataVisitor) {
            dataVisitor.visit(this);
        }

    }

    public static class Xml implements Data{

        @Override
        public void accept(DataVisitor dataVisitor) {
            dataVisitor.visit(this);
        }
    }
}
