package DAO;

class Glass {

    private int glass_id;
    private String glass_name;
    private int glass_price;
    private String glass_desp;

    public Glass(int id, String name, int price, String desp) {
        glass_id = id;
        glass_name = name;
        glass_price = price;
        glass_desp = desp;
    }

    @Override
    public String toString() {
        return "Glass{" + "glass_id=" + glass_id + ", glass_name=" + glass_name + ", glass_price=" + glass_price + ", glass_desp=" + glass_desp + '}';
    }

}
