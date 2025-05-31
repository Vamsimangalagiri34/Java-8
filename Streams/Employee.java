class Employee{
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(int id){
       this.id=id;
    }

    public boolean equalsx(Object obj){
      Employee e= (Employee) obj;
      return e.getId()==this.getId();
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
      this.name=name;
    }
    
    public String getName(){
      return name;

    }

     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
        // You can customize this string to include all relevant fields
    }


}