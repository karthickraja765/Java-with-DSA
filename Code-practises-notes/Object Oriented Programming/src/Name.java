class Name {
    // This is the Name class (used in WrapperClass)
    final int num = 30;
    String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Destorying...");
    }
}