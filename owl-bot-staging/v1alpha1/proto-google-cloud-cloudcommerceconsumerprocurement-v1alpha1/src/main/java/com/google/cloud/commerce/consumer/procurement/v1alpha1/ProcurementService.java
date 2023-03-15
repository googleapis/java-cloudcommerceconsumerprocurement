// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/commerce/consumer/procurement/v1alpha1/procurement_service.proto

package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public final class ProcurementService {
  private ProcurementService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/cloud/commerce/consumer/procure" +
      "ment/v1alpha1/procurement_service.proto\022" +
      "3google.cloud.commerce.consumer.procurem" +
      "ent.v1alpha1\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032?google/cloud/commerce/consumer/" +
      "procurement/v1alpha1/order.proto\032#google" +
      "/longrunning/operations.proto\"\353\001\n\021PlaceO" +
      "rderRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\n*clo" +
      "udbilling.googleapis.com/BillingAccount\022" +
      "\031\n\014display_name\030\006 \001(\tB\003\340A\002\022^\n\016line_item_" +
      "info\030\n \003(\0132A.google.cloud.commerce.consu" +
      "mer.procurement.v1alpha1.LineItemInfoB\003\340" +
      "A\001\022\027\n\nrequest_id\030\007 \001(\tB\003\340A\001\"\024\n\022PlaceOrde" +
      "rMetadata\"$\n\017GetOrderRequest\022\021\n\004name\030\001 \001" +
      "(\tB\003\340A\002\"_\n\021ListOrdersRequest\022\023\n\006parent\030\001" +
      " \001(\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok" +
      "en\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"y\n\022ListOrdersRe" +
      "sponse\022J\n\006orders\030\001 \003(\0132:.google.cloud.co" +
      "mmerce.consumer.procurement.v1alpha1.Ord" +
      "er\022\027\n\017next_page_token\030\002 \001(\t2\354\005\n\032Consumer" +
      "ProcurementService\022\317\001\n\nPlaceOrder\022F.goog" +
      "le.cloud.commerce.consumer.procurement.v" +
      "1alpha1.PlaceOrderRequest\032\035.google.longr" +
      "unning.Operation\"Z\202\323\344\223\0026\"1/v1alpha1/{par" +
      "ent=billingAccounts/*}/orders:place:\001*\312A" +
      "\033\n\005Order\022\022PlaceOrderMetadata\022\301\001\n\010GetOrde" +
      "r\022D.google.cloud.commerce.consumer.procu" +
      "rement.v1alpha1.GetOrderRequest\032:.google" +
      ".cloud.commerce.consumer.procurement.v1a" +
      "lpha1.Order\"3\202\323\344\223\002-\022+/v1alpha1/{name=bil" +
      "lingAccounts/*/orders/*}\022\322\001\n\nListOrders\022" +
      "F.google.cloud.commerce.consumer.procure" +
      "ment.v1alpha1.ListOrdersRequest\032G.google" +
      ".cloud.commerce.consumer.procurement.v1a" +
      "lpha1.ListOrdersResponse\"3\202\323\344\223\002-\022+/v1alp" +
      "ha1/{parent=billingAccounts/*}/orders\032c\312" +
      "A/cloudcommerceconsumerprocurement.googl" +
      "eapis.com\322A.https://www.googleapis.com/a" +
      "uth/cloud-platformB\226\001\n7com.google.cloud." +
      "commerce.consumer.procurement.v1alpha1P\001" +
      "ZYcloud.google.com/go/commerce/consumer/" +
      "procurement/apiv1alpha1/procurementpb;pr" +
      "ocurementpbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderRequest_descriptor,
        new java.lang.String[] { "Parent", "DisplayName", "LineItemInfo", "RequestId", });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_PlaceOrderMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_GetOrderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor,
        new java.lang.String[] { "Orders", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
