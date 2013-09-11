

/* First created by JCasGen Wed Sep 11 01:03:42 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** base
 * Updated by JCasGen Wed Sep 11 14:37:23 EDT 2013
 * XML source: C:/Users/Chiven/git/hw1-qiwenz/hw1-qiwenz-ziy-proto/src/main/resources/hw1-qiwenz-typeSystem.xml
 * @generated */
public class base extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(base.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected base() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public base(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public base(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public base(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (base_Type.featOkTst && ((base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "base");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((base_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (base_Type.featOkTst && ((base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "base");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((base_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public String getSource() {
    if (base_Type.featOkTst && ((base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "base");
    return jcasType.ll_cas.ll_getStringValue(addr, ((base_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(String v) {
    if (base_Type.featOkTst && ((base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "base");
    jcasType.ll_cas.ll_setStringValue(addr, ((base_Type)jcasType).casFeatCode_source, v);}    
  }

    