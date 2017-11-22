package DAO;

class Frame {
    private int frame_id;
    private String frame_name;
    private int frame_price;
    private String frame_desp;
    
    public Frame(int id, String name, int price, String desp) {
        frame_id = id;
        frame_name = name;
        frame_price = price;
        frame_desp = desp;
    }

    @Override
    public String toString() {
        return "Frame{" + "frame_id=" + frame_id + ", frame_name=" + frame_name + ", frame_price=" + frame_price + ", frame_desp=" + frame_desp + '}';
    }


    
}
