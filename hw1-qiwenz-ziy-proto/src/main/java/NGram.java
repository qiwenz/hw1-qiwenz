

/* First created by JCasGen Tue Sep 10 15:26:26 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** NGram
 * Updated by JCasGen Wed Sep 11 14:37:23 EDT 2013
 * XML source: C:/Users/Chiven/git/hw1-qiwenz/hw1-qiwenz-ziy-proto/src/main/resources/hw1-qiwenz-typeSystem.xml
 * @generated */
public class NGram extends base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: Element

  /** getter for Element - gets 
   * @generated */
  public FSArray getElement() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element)));}
    
  /** setter for Element - sets  
   * @generated */
  public void setElement(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Element - gets an indexed value - 
   * @generated */
  public Token getElement(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i)));}

  /** indexed setter for Element - sets an indexed value - 
   * @generated */
  public void setElement(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: ElementType

  /** getter for ElementType - gets 
   * @generated */
  public String getElementType() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ElementType == null)
      jcasType.jcas.throwFeatMissing("ElementType", "NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ElementType);}
    
  /** setter for ElementType - sets  
   * @generated */
  public void setElementType(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ElementType == null)
      jcasType.jcas.throwFeatMissing("ElementType", "NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ElementType, v);}    
  }

    