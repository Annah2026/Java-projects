
  ublic abstract class BaseEntity {
    private String id;

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getEntityId() {
        return id;
    }

    
    public abstract void showDetails();
}  
}
