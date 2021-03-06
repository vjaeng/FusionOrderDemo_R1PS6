package devguide.advanced.multiplevc;

import devguide.advanced.multiplevc.common.PersonsView;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.VariableValueManager;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PersonsViewImpl extends ViewObjectImpl implements PersonsView {
    /**This is the default constructor (do not remove).
     */
    public PersonsViewImpl() {
    }
    
    public void showMaleCustomers() {
        ViewCriteriaManager vcm = getViewCriteriaManager();
        ViewCriteria vc_gender = vcm.getViewCriteria("GenderIsNotFCriteria");
        ViewCriteria vc_type = vcm.getViewCriteria("IsCustomerCriteria");
        VariableValueManager vvm_gender = vc_gender.ensureVariableManager();
        VariableValueManager vvm_type = vc_type.ensureVariableManager();
        vvm_gender.setVariableValue("bv_Gender","F");
        vvm_type.setVariableValue("bv_PersonTypeCode", "CUST");
        setApplyViewCriteriaNames(new String[]{"GenderIsNotFCriteria", "IsCustomerCriteria"});
    }

    public void showFemaleStaff() {
        ViewCriteriaManager vcm = getViewCriteriaManager();
        ViewCriteria vc_gender = vcm.getViewCriteria("GenderIsFCriteria");
        ViewCriteria vc_type = vcm.getViewCriteria("IsStaffSupplierCriteria");
        VariableValueManager vvm_gender = vc_gender.ensureVariableManager();
        VariableValueManager vvm_type = vc_type.ensureVariableManager();
        vvm_gender.setVariableValue("bv_Gender","F");
        vvm_type.setVariableValue("bv_PersonTypeCode", "CUST");
        setApplyViewCriteriaNames(new String[]{"GenderIsFCriteria", "IsStaffSupplierCriteria"});
        executeQuery();
    }

    public void showFemaleCustomers() {
        ViewCriteriaManager vcm = getViewCriteriaManager();
        ViewCriteria vc_gender = vcm.getViewCriteria("GenderIsFCriteria");
        ViewCriteria vc_type = vcm.getViewCriteria("IsCustomerCriteria");
        VariableValueManager vvm_gender = vc_gender.ensureVariableManager();
        VariableValueManager vvm_type = vc_type.ensureVariableManager();
        vvm_gender.setVariableValue("bv_Gender","F");
        vvm_type.setVariableValue("bv_PersonTypeCode", "CUST");
        setApplyViewCriteriaNames(new String[]{"GenderIsFCriteria", "IsCustomerCriteria"});
        executeQuery();
    }

    public void showAll() {
        setApplyViewCriteriaNames(null);
        executeQuery();
    }

    /**Gets the variable value for bv_PersonTypeCode.
     */
    public String getbv_PersonTypeCode() {
        return (String)ensureVariableManager().getVariableValue("bv_PersonTypeCode");
    }

    /**Sets <code>value</code> for variable bv_PersonTypeCode.
     */
    public void setbv_PersonTypeCode(String value) {
        ensureVariableManager().setVariableValue("bv_PersonTypeCode", value);
    }

    /**Gets the variable value for bv_Gender.
     */
    public String getbv_Gender() {
        return (String)ensureVariableManager().getVariableValue("bv_Gender");
    }

    /**Sets <code>value</code> for variable bv_Gender.
     */
    public void setbv_Gender(String value) {
        ensureVariableManager().setVariableValue("bv_Gender", value);
    }
}
