package Classes.constructorsAndSetters.package1;

public class computer {

    private String _name;
    private String _phone;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public computer(String _name, String _phone) {
        this._name = _name;
        this._phone = _phone;
    }

}
