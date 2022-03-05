/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tsb.ods.sys.api.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Avro schema for TransactionRequestIA7061 */
@org.apache.avro.specific.AvroGenerated
public class TransactionRequestIA7061 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7155055134139765606L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TransactionRequestIA7061\",\"namespace\":\"com.tsb.ods.sys.api.schema\",\"doc\":\"Avro schema for TransactionRequestIA7061\",\"fields\":[{\"name\":\"entidnper\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"accion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"idmarca\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"idpersona\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"tipper\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"elements\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DocConfigOp\",\"fields\":[{\"name\":\"application\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"correspondence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"statements\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TransactionRequestIA7061> ENCODER =
      new BinaryMessageEncoder<TransactionRequestIA7061>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TransactionRequestIA7061> DECODER =
      new BinaryMessageDecoder<TransactionRequestIA7061>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TransactionRequestIA7061> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TransactionRequestIA7061> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TransactionRequestIA7061> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TransactionRequestIA7061>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TransactionRequestIA7061 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TransactionRequestIA7061 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TransactionRequestIA7061 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TransactionRequestIA7061 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String entidnper;
  private java.lang.String accion;
  private java.lang.String idmarca;
  private java.lang.Long idpersona;
  private java.lang.String tipper;
  private java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> elements;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TransactionRequestIA7061() {}

  /**
   * All-args constructor.
   * @param entidnper The new value for entidnper
   * @param accion The new value for accion
   * @param idmarca The new value for idmarca
   * @param idpersona The new value for idpersona
   * @param tipper The new value for tipper
   * @param elements The new value for elements
   */
  public TransactionRequestIA7061(java.lang.String entidnper, java.lang.String accion, java.lang.String idmarca, java.lang.Long idpersona, java.lang.String tipper, java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> elements) {
    this.entidnper = entidnper;
    this.accion = accion;
    this.idmarca = idmarca;
    this.idpersona = idpersona;
    this.tipper = tipper;
    this.elements = elements;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return entidnper;
    case 1: return accion;
    case 2: return idmarca;
    case 3: return idpersona;
    case 4: return tipper;
    case 5: return elements;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: entidnper = value$ != null ? value$.toString() : null; break;
    case 1: accion = value$ != null ? value$.toString() : null; break;
    case 2: idmarca = value$ != null ? value$.toString() : null; break;
    case 3: idpersona = (java.lang.Long)value$; break;
    case 4: tipper = value$ != null ? value$.toString() : null; break;
    case 5: elements = (java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'entidnper' field.
   * @return The value of the 'entidnper' field.
   */
  public java.lang.String getEntidnper() {
    return entidnper;
  }


  /**
   * Sets the value of the 'entidnper' field.
   * @param value the value to set.
   */
  public void setEntidnper(java.lang.String value) {
    this.entidnper = value;
  }

  /**
   * Gets the value of the 'accion' field.
   * @return The value of the 'accion' field.
   */
  public java.lang.String getAccion() {
    return accion;
  }


  /**
   * Sets the value of the 'accion' field.
   * @param value the value to set.
   */
  public void setAccion(java.lang.String value) {
    this.accion = value;
  }

  /**
   * Gets the value of the 'idmarca' field.
   * @return The value of the 'idmarca' field.
   */
  public java.lang.String getIdmarca() {
    return idmarca;
  }


  /**
   * Sets the value of the 'idmarca' field.
   * @param value the value to set.
   */
  public void setIdmarca(java.lang.String value) {
    this.idmarca = value;
  }

  /**
   * Gets the value of the 'idpersona' field.
   * @return The value of the 'idpersona' field.
   */
  public java.lang.Long getIdpersona() {
    return idpersona;
  }


  /**
   * Sets the value of the 'idpersona' field.
   * @param value the value to set.
   */
  public void setIdpersona(java.lang.Long value) {
    this.idpersona = value;
  }

  /**
   * Gets the value of the 'tipper' field.
   * @return The value of the 'tipper' field.
   */
  public java.lang.String getTipper() {
    return tipper;
  }


  /**
   * Sets the value of the 'tipper' field.
   * @param value the value to set.
   */
  public void setTipper(java.lang.String value) {
    this.tipper = value;
  }

  /**
   * Gets the value of the 'elements' field.
   * @return The value of the 'elements' field.
   */
  public java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> getElements() {
    return elements;
  }


  /**
   * Sets the value of the 'elements' field.
   * @param value the value to set.
   */
  public void setElements(java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> value) {
    this.elements = value;
  }

  /**
   * Creates a new TransactionRequestIA7061 RecordBuilder.
   * @return A new TransactionRequestIA7061 RecordBuilder
   */
  public static com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder newBuilder() {
    return new com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder();
  }

  /**
   * Creates a new TransactionRequestIA7061 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TransactionRequestIA7061 RecordBuilder
   */
  public static com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder newBuilder(com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder other) {
    if (other == null) {
      return new com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder();
    } else {
      return new com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder(other);
    }
  }

  /**
   * Creates a new TransactionRequestIA7061 RecordBuilder by copying an existing TransactionRequestIA7061 instance.
   * @param other The existing instance to copy.
   * @return A new TransactionRequestIA7061 RecordBuilder
   */
  public static com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder newBuilder(com.tsb.ods.sys.api.schema.TransactionRequestIA7061 other) {
    if (other == null) {
      return new com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder();
    } else {
      return new com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder(other);
    }
  }

  /**
   * RecordBuilder for TransactionRequestIA7061 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TransactionRequestIA7061>
    implements org.apache.avro.data.RecordBuilder<TransactionRequestIA7061> {

    private java.lang.String entidnper;
    private java.lang.String accion;
    private java.lang.String idmarca;
    private java.lang.Long idpersona;
    private java.lang.String tipper;
    private java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> elements;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.entidnper)) {
        this.entidnper = data().deepCopy(fields()[0].schema(), other.entidnper);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.accion)) {
        this.accion = data().deepCopy(fields()[1].schema(), other.accion);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.idmarca)) {
        this.idmarca = data().deepCopy(fields()[2].schema(), other.idmarca);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.idpersona)) {
        this.idpersona = data().deepCopy(fields()[3].schema(), other.idpersona);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.tipper)) {
        this.tipper = data().deepCopy(fields()[4].schema(), other.tipper);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.elements)) {
        this.elements = data().deepCopy(fields()[5].schema(), other.elements);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing TransactionRequestIA7061 instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tsb.ods.sys.api.schema.TransactionRequestIA7061 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.entidnper)) {
        this.entidnper = data().deepCopy(fields()[0].schema(), other.entidnper);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accion)) {
        this.accion = data().deepCopy(fields()[1].schema(), other.accion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.idmarca)) {
        this.idmarca = data().deepCopy(fields()[2].schema(), other.idmarca);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.idpersona)) {
        this.idpersona = data().deepCopy(fields()[3].schema(), other.idpersona);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tipper)) {
        this.tipper = data().deepCopy(fields()[4].schema(), other.tipper);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.elements)) {
        this.elements = data().deepCopy(fields()[5].schema(), other.elements);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'entidnper' field.
      * @return The value.
      */
    public java.lang.String getEntidnper() {
      return entidnper;
    }


    /**
      * Sets the value of the 'entidnper' field.
      * @param value The value of 'entidnper'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setEntidnper(java.lang.String value) {
      validate(fields()[0], value);
      this.entidnper = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'entidnper' field has been set.
      * @return True if the 'entidnper' field has been set, false otherwise.
      */
    public boolean hasEntidnper() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'entidnper' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearEntidnper() {
      entidnper = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'accion' field.
      * @return The value.
      */
    public java.lang.String getAccion() {
      return accion;
    }


    /**
      * Sets the value of the 'accion' field.
      * @param value The value of 'accion'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setAccion(java.lang.String value) {
      validate(fields()[1], value);
      this.accion = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'accion' field has been set.
      * @return True if the 'accion' field has been set, false otherwise.
      */
    public boolean hasAccion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'accion' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearAccion() {
      accion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'idmarca' field.
      * @return The value.
      */
    public java.lang.String getIdmarca() {
      return idmarca;
    }


    /**
      * Sets the value of the 'idmarca' field.
      * @param value The value of 'idmarca'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setIdmarca(java.lang.String value) {
      validate(fields()[2], value);
      this.idmarca = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'idmarca' field has been set.
      * @return True if the 'idmarca' field has been set, false otherwise.
      */
    public boolean hasIdmarca() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'idmarca' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearIdmarca() {
      idmarca = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'idpersona' field.
      * @return The value.
      */
    public java.lang.Long getIdpersona() {
      return idpersona;
    }


    /**
      * Sets the value of the 'idpersona' field.
      * @param value The value of 'idpersona'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setIdpersona(java.lang.Long value) {
      validate(fields()[3], value);
      this.idpersona = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'idpersona' field has been set.
      * @return True if the 'idpersona' field has been set, false otherwise.
      */
    public boolean hasIdpersona() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'idpersona' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearIdpersona() {
      idpersona = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'tipper' field.
      * @return The value.
      */
    public java.lang.String getTipper() {
      return tipper;
    }


    /**
      * Sets the value of the 'tipper' field.
      * @param value The value of 'tipper'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setTipper(java.lang.String value) {
      validate(fields()[4], value);
      this.tipper = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'tipper' field has been set.
      * @return True if the 'tipper' field has been set, false otherwise.
      */
    public boolean hasTipper() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'tipper' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearTipper() {
      tipper = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'elements' field.
      * @return The value.
      */
    public java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> getElements() {
      return elements;
    }


    /**
      * Sets the value of the 'elements' field.
      * @param value The value of 'elements'.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder setElements(java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> value) {
      validate(fields()[5], value);
      this.elements = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'elements' field has been set.
      * @return True if the 'elements' field has been set, false otherwise.
      */
    public boolean hasElements() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'elements' field.
      * @return This builder.
      */
    public com.tsb.ods.sys.api.schema.TransactionRequestIA7061.Builder clearElements() {
      elements = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TransactionRequestIA7061 build() {
      try {
        TransactionRequestIA7061 record = new TransactionRequestIA7061();
        record.entidnper = fieldSetFlags()[0] ? this.entidnper : (java.lang.String) defaultValue(fields()[0]);
        record.accion = fieldSetFlags()[1] ? this.accion : (java.lang.String) defaultValue(fields()[1]);
        record.idmarca = fieldSetFlags()[2] ? this.idmarca : (java.lang.String) defaultValue(fields()[2]);
        record.idpersona = fieldSetFlags()[3] ? this.idpersona : (java.lang.Long) defaultValue(fields()[3]);
        record.tipper = fieldSetFlags()[4] ? this.tipper : (java.lang.String) defaultValue(fields()[4]);
        record.elements = fieldSetFlags()[5] ? this.elements : (java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TransactionRequestIA7061>
    WRITER$ = (org.apache.avro.io.DatumWriter<TransactionRequestIA7061>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TransactionRequestIA7061>
    READER$ = (org.apache.avro.io.DatumReader<TransactionRequestIA7061>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.entidnper == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.entidnper);
    }

    if (this.accion == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.accion);
    }

    if (this.idmarca == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.idmarca);
    }

    if (this.idpersona == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.idpersona);
    }

    if (this.tipper == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.tipper);
    }

    long size0 = this.elements.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.tsb.ods.sys.api.schema.DocConfigOp e0: this.elements) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.entidnper = null;
      } else {
        this.entidnper = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.accion = null;
      } else {
        this.accion = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.idmarca = null;
      } else {
        this.idmarca = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.idpersona = null;
      } else {
        this.idpersona = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.tipper = null;
      } else {
        this.tipper = in.readString();
      }

      long size0 = in.readArrayStart();
      java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> a0 = this.elements;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp>((int)size0, SCHEMA$.getField("elements").schema());
        this.elements = a0;
      } else a0.clear();
      SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.tsb.ods.sys.api.schema.DocConfigOp e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.tsb.ods.sys.api.schema.DocConfigOp();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.entidnper = null;
          } else {
            this.entidnper = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.accion = null;
          } else {
            this.accion = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.idmarca = null;
          } else {
            this.idmarca = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.idpersona = null;
          } else {
            this.idpersona = in.readLong();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tipper = null;
          } else {
            this.tipper = in.readString();
          }
          break;

        case 5:
          long size0 = in.readArrayStart();
          java.util.List<com.tsb.ods.sys.api.schema.DocConfigOp> a0 = this.elements;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp>((int)size0, SCHEMA$.getField("elements").schema());
            this.elements = a0;
          } else a0.clear();
          SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.tsb.ods.sys.api.schema.DocConfigOp>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.tsb.ods.sys.api.schema.DocConfigOp e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.tsb.ods.sys.api.schema.DocConfigOp();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









