package com.xiaofei.legacyazurescanner;

import com.xiaofei.legacyazurescanner.maven.MavenBranchPage;
import com.xiaofei.legacyazurescanner.maven.MavenLeafPage;
import com.xiaofei.legacyazurescanner.maven.MavenPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xiaofeicao
 */
public class MavenPageTests {
    @Test
    public void testLeaf() {
        MavenPage mavenPage = MavenPage.parse("https://repo1.maven.org/maven2/com/azure/resourcemanager/azure-resourcemanager-arizeaiobservabilityeval/",
            "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "\t<title>Central Repository: com/azure/resourcemanager/azure-resourcemanager-arizeaiobservabilityeval</title>\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "\t<style>\n" +
                "body {\n" +
                "\tbackground: #fff;\n" +
                "}\n" +
                "\t</style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\t<header>\n" +
                "\t\t<h1>com/azure/resourcemanager/azure-resourcemanager-arizeaiobservabilityeval</h1>\n" +
                "\t</header>\n" +
                "\t<hr/>\n" +
                "\t<main>\n" +
                "\t\t<pre id=\"contents\">\n" +
                "<a href=\"../\">../</a>\n" +
                "<a href=\"1.0.0/\" title=\"1.0.0/\">1.0.0/</a>                                            2025-07-03 06:40         -      \n" +
                "<a href=\"1.0.0-beta.1/\" title=\"1.0.0-beta.1/\">1.0.0-beta.1/</a>                                     2025-03-31 08:23         -      \n" +
                "<a href=\"maven-metadata.xml\" title=\"maven-metadata.xml\">maven-metadata.xml</a>                                2025-07-03 06:49       416      \n" +
                "<a href=\"maven-metadata.xml.md5\" title=\"maven-metadata.xml.md5\">maven-metadata.xml.md5</a>                            2025-07-03 06:49        32      \n" +
                "<a href=\"maven-metadata.xml.sha1\" title=\"maven-metadata.xml.sha1\">maven-metadata.xml.sha1</a>                           2025-07-03 06:49        40      \n" +
                "<a href=\"maven-metadata.xml.sha256\" title=\"maven-metadata.xml.sha256\">maven-metadata.xml.sha256</a>                         2025-07-03 06:49        64      \n" +
                "<a href=\"maven-metadata.xml.sha512\" title=\"maven-metadata.xml.sha512\">maven-metadata.xml.sha512</a>                         2025-07-03 06:49       128      \n" +
                "\t\t</pre>\n" +
                "\t</main>\n" +
                "\t<hr/>\n" +
                "</body>\n" +
                "\n" +
                "</html>");
        Assertions.assertInstanceOf(MavenLeafPage.class, mavenPage);
    }

    @Test
    public void testBranch() {
        MavenPage mavenPage = MavenPage.parse("https://repo1.maven.org/maven2/com/azure/resourcemanager/",
            "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Central Repository: com/azure/resourcemanager</title>\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "        <style>\n" +
                "            body {\n" +
                "                background: #fff;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <header>\n" +
                "            <h1>com/azure/resourcemanager</h1>\n" +
                "        </header>\n" +
                "        <hr/>\n" +
                "        <main>\n" +
                "            <pre id=\"contents\">\n" +
                "                <a href=\"../\">../</a>\n" +
                "                <a href=\"azure-resourcemanager/\" title=\"azure-resourcemanager/\">azure-resourcemanager/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-advisor/\" title=\"azure-resourcemanager-advisor/\">azure-resourcemanager-advisor/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-agrifood/\" title=\"azure-resourcemanager-agrifood/\">azure-resourcemanager-agrifood/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-alertsmanagement/\" title=\"azure-resourcemanager-alertsmanagement/\">azure-resourcemanager-alertsmanagement/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-apicenter/\" title=\"azure-resourcemanager-apicenter/\">azure-resourcemanager-apicenter/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-apimanagement/\" title=\"azure-resourcemanager-apimanagement/\">azure-resourcemanager-apimanagement/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-appcomplianceautomation/\" title=\"azure-resourcemanager-appcomplianceautomation/\">azure-resourcemanager-appcomplianceautomation/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-appconfiguration/\" title=\"azure-resourcemanager-appconfiguration/\">azure-resourcemanager-appconfiguration/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-appcontainers/\" title=\"azure-resourcemanager-appcontainers/\">azure-resourcemanager-appcontainers/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-applicationinsights/\" title=\"azure-resourcemanager-applicationinsights/\">azure-resourcemanager-applicationinsights/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-appplatform/\" title=\"azure-resourcemanager-appplatform/\">azure-resourcemanager-appplatform/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-appservice/\" title=\"azure-resourcemanager-appservice/\">azure-resourcemanager-appservice/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-arizeaiobservabilityeval/\" title=\"azure-resourcemanager-arizeaiobservabilityeval/\">azure-resourcemanager-arizeaiobservabilityev.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-astro/\" title=\"azure-resourcemanager-astro/\">azure-resourcemanager-astro/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-attestation/\" title=\"azure-resourcemanager-attestation/\">azure-resourcemanager-attestation/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-authorization/\" title=\"azure-resourcemanager-authorization/\">azure-resourcemanager-authorization/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-automanage/\" title=\"azure-resourcemanager-automanage/\">azure-resourcemanager-automanage/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-automation/\" title=\"azure-resourcemanager-automation/\">azure-resourcemanager-automation/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-avs/\" title=\"azure-resourcemanager-avs/\">azure-resourcemanager-avs/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-azurearcdata/\" title=\"azure-resourcemanager-azurearcdata/\">azure-resourcemanager-azurearcdata/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-azurestack/\" title=\"azure-resourcemanager-azurestack/\">azure-resourcemanager-azurestack/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-azurestackhci/\" title=\"azure-resourcemanager-azurestackhci/\">azure-resourcemanager-azurestackhci/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-azurestackhci-vm/\" title=\"azure-resourcemanager-azurestackhci-vm/\">azure-resourcemanager-azurestackhci-vm/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-baremetalinfrastructure/\" title=\"azure-resourcemanager-baremetalinfrastructure/\">azure-resourcemanager-baremetalinfrastructure/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-batch/\" title=\"azure-resourcemanager-batch/\">azure-resourcemanager-batch/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-batchai/\" title=\"azure-resourcemanager-batchai/\">azure-resourcemanager-batchai/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-billing/\" title=\"azure-resourcemanager-billing/\">azure-resourcemanager-billing/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-billingbenefits/\" title=\"azure-resourcemanager-billingbenefits/\">azure-resourcemanager-billingbenefits/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-botservice/\" title=\"azure-resourcemanager-botservice/\">azure-resourcemanager-botservice/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-carbonoptimization/\" title=\"azure-resourcemanager-carbonoptimization/\">azure-resourcemanager-carbonoptimization/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-cdn/\" title=\"azure-resourcemanager-cdn/\">azure-resourcemanager-cdn/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-changeanalysis/\" title=\"azure-resourcemanager-changeanalysis/\">azure-resourcemanager-changeanalysis/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-chaos/\" title=\"azure-resourcemanager-chaos/\">azure-resourcemanager-chaos/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-cloudhealth/\" title=\"azure-resourcemanager-cloudhealth/\">azure-resourcemanager-cloudhealth/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-cognitiveservices/\" title=\"azure-resourcemanager-cognitiveservices/\">azure-resourcemanager-cognitiveservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-commerce/\" title=\"azure-resourcemanager-commerce/\">azure-resourcemanager-commerce/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-communication/\" title=\"azure-resourcemanager-communication/\">azure-resourcemanager-communication/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-compute/\" title=\"azure-resourcemanager-compute/\">azure-resourcemanager-compute/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-compute-recommender/\" title=\"azure-resourcemanager-compute-recommender/\">azure-resourcemanager-compute-recommender/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-computefleet/\" title=\"azure-resourcemanager-computefleet/\">azure-resourcemanager-computefleet/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-computelimit/\" title=\"azure-resourcemanager-computelimit/\">azure-resourcemanager-computelimit/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-computerecommender/\" title=\"azure-resourcemanager-computerecommender/\">azure-resourcemanager-computerecommender/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-computeschedule/\" title=\"azure-resourcemanager-computeschedule/\">azure-resourcemanager-computeschedule/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-confidentialledger/\" title=\"azure-resourcemanager-confidentialledger/\">azure-resourcemanager-confidentialledger/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-confluent/\" title=\"azure-resourcemanager-confluent/\">azure-resourcemanager-confluent/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-connectedcache/\" title=\"azure-resourcemanager-connectedcache/\">azure-resourcemanager-connectedcache/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-connectedvmware/\" title=\"azure-resourcemanager-connectedvmware/\">azure-resourcemanager-connectedvmware/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-consumption/\" title=\"azure-resourcemanager-consumption/\">azure-resourcemanager-consumption/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerinstance/\" title=\"azure-resourcemanager-containerinstance/\">azure-resourcemanager-containerinstance/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerorchestratorruntime/\" title=\"azure-resourcemanager-containerorchestratorruntime/\">azure-resourcemanager-containerorchestratorr.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerregistry/\" title=\"azure-resourcemanager-containerregistry/\">azure-resourcemanager-containerregistry/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerservice/\" title=\"azure-resourcemanager-containerservice/\">azure-resourcemanager-containerservice/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerservicefleet/\" title=\"azure-resourcemanager-containerservicefleet/\">azure-resourcemanager-containerservicefleet/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-containerservicesafeguards/\" title=\"azure-resourcemanager-containerservicesafeguards/\">azure-resourcemanager-containerservicesafegu.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-cosmos/\" title=\"azure-resourcemanager-cosmos/\">azure-resourcemanager-cosmos/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-cosmosdbforpostgresql/\" title=\"azure-resourcemanager-cosmosdbforpostgresql/\">azure-resourcemanager-cosmosdbforpostgresql/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-costmanagement/\" title=\"azure-resourcemanager-costmanagement/\">azure-resourcemanager-costmanagement/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-customerinsights/\" title=\"azure-resourcemanager-customerinsights/\">azure-resourcemanager-customerinsights/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dashboard/\" title=\"azure-resourcemanager-dashboard/\">azure-resourcemanager-dashboard/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-databasewatcher/\" title=\"azure-resourcemanager-databasewatcher/\">azure-resourcemanager-databasewatcher/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-databox/\" title=\"azure-resourcemanager-databox/\">azure-resourcemanager-databox/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-databoxedge/\" title=\"azure-resourcemanager-databoxedge/\">azure-resourcemanager-databoxedge/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-databricks/\" title=\"azure-resourcemanager-databricks/\">azure-resourcemanager-databricks/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-datadog/\" title=\"azure-resourcemanager-datadog/\">azure-resourcemanager-datadog/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-datafactory/\" title=\"azure-resourcemanager-datafactory/\">azure-resourcemanager-datafactory/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-datalakeanalytics/\" title=\"azure-resourcemanager-datalakeanalytics/\">azure-resourcemanager-datalakeanalytics/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-datalakestore/\" title=\"azure-resourcemanager-datalakestore/\">azure-resourcemanager-datalakestore/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-datamigration/\" title=\"azure-resourcemanager-datamigration/\">azure-resourcemanager-datamigration/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dataprotection/\" title=\"azure-resourcemanager-dataprotection/\">azure-resourcemanager-dataprotection/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-defendereasm/\" title=\"azure-resourcemanager-defendereasm/\">azure-resourcemanager-defendereasm/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-delegatednetwork/\" title=\"azure-resourcemanager-delegatednetwork/\">azure-resourcemanager-delegatednetwork/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dell-storage/\" title=\"azure-resourcemanager-dell-storage/\">azure-resourcemanager-dell-storage/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dependencymap/\" title=\"azure-resourcemanager-dependencymap/\">azure-resourcemanager-dependencymap/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-deploymentmanager/\" title=\"azure-resourcemanager-deploymentmanager/\">azure-resourcemanager-deploymentmanager/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-desktopvirtualization/\" title=\"azure-resourcemanager-desktopvirtualization/\">azure-resourcemanager-desktopvirtualization/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-devcenter/\" title=\"azure-resourcemanager-devcenter/\">azure-resourcemanager-devcenter/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-devhub/\" title=\"azure-resourcemanager-devhub/\">azure-resourcemanager-devhub/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-deviceprovisioningservices/\" title=\"azure-resourcemanager-deviceprovisioningservices/\">azure-resourcemanager-deviceprovisioningserv.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-deviceregistry/\" title=\"azure-resourcemanager-deviceregistry/\">azure-resourcemanager-deviceregistry/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-deviceupdate/\" title=\"azure-resourcemanager-deviceupdate/\">azure-resourcemanager-deviceupdate/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-devopsinfrastructure/\" title=\"azure-resourcemanager-devopsinfrastructure/\">azure-resourcemanager-devopsinfrastructure/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-devspaces/\" title=\"azure-resourcemanager-devspaces/\">azure-resourcemanager-devspaces/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-devtestlabs/\" title=\"azure-resourcemanager-devtestlabs/\">azure-resourcemanager-devtestlabs/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-digitaltwins/\" title=\"azure-resourcemanager-digitaltwins/\">azure-resourcemanager-digitaltwins/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dns/\" title=\"azure-resourcemanager-dns/\">azure-resourcemanager-dns/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dnsresolver/\" title=\"azure-resourcemanager-dnsresolver/\">azure-resourcemanager-dnsresolver/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-durabletask/\" title=\"azure-resourcemanager-durabletask/\">azure-resourcemanager-durabletask/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-dynatrace/\" title=\"azure-resourcemanager-dynatrace/\">azure-resourcemanager-dynatrace/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-edgeorder/\" title=\"azure-resourcemanager-edgeorder/\">azure-resourcemanager-edgeorder/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-edgezones/\" title=\"azure-resourcemanager-edgezones/\">azure-resourcemanager-edgezones/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-education/\" title=\"azure-resourcemanager-education/\">azure-resourcemanager-education/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-elastic/\" title=\"azure-resourcemanager-elastic/\">azure-resourcemanager-elastic/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-elasticsan/\" title=\"azure-resourcemanager-elasticsan/\">azure-resourcemanager-elasticsan/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-eventgrid/\" title=\"azure-resourcemanager-eventgrid/\">azure-resourcemanager-eventgrid/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-eventhubs/\" title=\"azure-resourcemanager-eventhubs/\">azure-resourcemanager-eventhubs/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-extendedlocation/\" title=\"azure-resourcemanager-extendedlocation/\">azure-resourcemanager-extendedlocation/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-fabric/\" title=\"azure-resourcemanager-fabric/\">azure-resourcemanager-fabric/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-fluidrelay/\" title=\"azure-resourcemanager-fluidrelay/\">azure-resourcemanager-fluidrelay/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-frontdoor/\" title=\"azure-resourcemanager-frontdoor/\">azure-resourcemanager-frontdoor/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-graphservices/\" title=\"azure-resourcemanager-graphservices/\">azure-resourcemanager-graphservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hanaonazure/\" title=\"azure-resourcemanager-hanaonazure/\">azure-resourcemanager-hanaonazure/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hardwaresecuritymodules/\" title=\"azure-resourcemanager-hardwaresecuritymodules/\">azure-resourcemanager-hardwaresecuritymodules/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hdinsight/\" title=\"azure-resourcemanager-hdinsight/\">azure-resourcemanager-hdinsight/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hdinsight-containers/\" title=\"azure-resourcemanager-hdinsight-containers/\">azure-resourcemanager-hdinsight-containers/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-healthbot/\" title=\"azure-resourcemanager-healthbot/\">azure-resourcemanager-healthbot/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-healthcareapis/\" title=\"azure-resourcemanager-healthcareapis/\">azure-resourcemanager-healthcareapis/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-healthdataaiservices/\" title=\"azure-resourcemanager-healthdataaiservices/\">azure-resourcemanager-healthdataaiservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hybridcompute/\" title=\"azure-resourcemanager-hybridcompute/\">azure-resourcemanager-hybridcompute/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hybridconnectivity/\" title=\"azure-resourcemanager-hybridconnectivity/\">azure-resourcemanager-hybridconnectivity/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hybridcontainerservice/\" title=\"azure-resourcemanager-hybridcontainerservice/\">azure-resourcemanager-hybridcontainerservice/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hybridkubernetes/\" title=\"azure-resourcemanager-hybridkubernetes/\">azure-resourcemanager-hybridkubernetes/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-hybridnetwork/\" title=\"azure-resourcemanager-hybridnetwork/\">azure-resourcemanager-hybridnetwork/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-imagebuilder/\" title=\"azure-resourcemanager-imagebuilder/\">azure-resourcemanager-imagebuilder/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-impactreporting/\" title=\"azure-resourcemanager-impactreporting/\">azure-resourcemanager-impactreporting/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-informaticadatamanagement/\" title=\"azure-resourcemanager-informaticadatamanagement/\">azure-resourcemanager-informaticadatamanagem.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-iotcentral/\" title=\"azure-resourcemanager-iotcentral/\">azure-resourcemanager-iotcentral/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-iotfirmwaredefense/\" title=\"azure-resourcemanager-iotfirmwaredefense/\">azure-resourcemanager-iotfirmwaredefense/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-iothub/\" title=\"azure-resourcemanager-iothub/\">azure-resourcemanager-iothub/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-iotoperations/\" title=\"azure-resourcemanager-iotoperations/\">azure-resourcemanager-iotoperations/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-keyvault/\" title=\"azure-resourcemanager-keyvault/\">azure-resourcemanager-keyvault/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kubernetesconfiguration/\" title=\"azure-resourcemanager-kubernetesconfiguration/\">azure-resourcemanager-kubernetesconfiguration/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kubernetesconfiguration-extensions/\" title=\"azure-resourcemanager-kubernetesconfiguration-extensions/\">azure-resourcemanager-kubernetesconfiguratio.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kubernetesconfiguration-extensiontypes/\" title=\"azure-resourcemanager-kubernetesconfiguration-extensiontypes/\">azure-resourcemanager-kubernetesconfiguratio.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kubernetesconfiguration-fluxconfigurations/\" title=\"azure-resourcemanager-kubernetesconfiguration-fluxconfigurations/\">azure-resourcemanager-kubernetesconfiguratio.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kubernetesconfiguration-privatelinkscopes/\" title=\"azure-resourcemanager-kubernetesconfiguration-privatelinkscopes/\">azure-resourcemanager-kubernetesconfiguratio.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-kusto/\" title=\"azure-resourcemanager-kusto/\">azure-resourcemanager-kusto/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-labservices/\" title=\"azure-resourcemanager-labservices/\">azure-resourcemanager-labservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-lambdatesthyperexecute/\" title=\"azure-resourcemanager-lambdatesthyperexecute/\">azure-resourcemanager-lambdatesthyperexecute/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-largeinstance/\" title=\"azure-resourcemanager-largeinstance/\">azure-resourcemanager-largeinstance/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-loadtesting/\" title=\"azure-resourcemanager-loadtesting/\">azure-resourcemanager-loadtesting/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-loadtestservice/\" title=\"azure-resourcemanager-loadtestservice/\">azure-resourcemanager-loadtestservice/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-loganalytics/\" title=\"azure-resourcemanager-loganalytics/\">azure-resourcemanager-loganalytics/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-logic/\" title=\"azure-resourcemanager-logic/\">azure-resourcemanager-logic/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-logz/\" title=\"azure-resourcemanager-logz/\">azure-resourcemanager-logz/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-machinelearning/\" title=\"azure-resourcemanager-machinelearning/\">azure-resourcemanager-machinelearning/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-machinelearningservices/\" title=\"azure-resourcemanager-machinelearningservices/\">azure-resourcemanager-machinelearningservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-maintenance/\" title=\"azure-resourcemanager-maintenance/\">azure-resourcemanager-maintenance/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-managedapplications/\" title=\"azure-resourcemanager-managedapplications/\">azure-resourcemanager-managedapplications/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-managednetworkfabric/\" title=\"azure-resourcemanager-managednetworkfabric/\">azure-resourcemanager-managednetworkfabric/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-managementgroups/\" title=\"azure-resourcemanager-managementgroups/\">azure-resourcemanager-managementgroups/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-maps/\" title=\"azure-resourcemanager-maps/\">azure-resourcemanager-maps/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mariadb/\" title=\"azure-resourcemanager-mariadb/\">azure-resourcemanager-mariadb/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-marketplaceordering/\" title=\"azure-resourcemanager-marketplaceordering/\">azure-resourcemanager-marketplaceordering/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mediaservices/\" title=\"azure-resourcemanager-mediaservices/\">azure-resourcemanager-mediaservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-migration-assessment/\" title=\"azure-resourcemanager-migration-assessment/\">azure-resourcemanager-migration-assessment/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-migrationdiscoverysap/\" title=\"azure-resourcemanager-migrationdiscoverysap/\">azure-resourcemanager-migrationdiscoverysap/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mixedreality/\" title=\"azure-resourcemanager-mixedreality/\">azure-resourcemanager-mixedreality/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mobilenetwork/\" title=\"azure-resourcemanager-mobilenetwork/\">azure-resourcemanager-mobilenetwork/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mongocluster/\" title=\"azure-resourcemanager-mongocluster/\">azure-resourcemanager-mongocluster/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mongodbatlas/\" title=\"azure-resourcemanager-mongodbatlas/\">azure-resourcemanager-mongodbatlas/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-monitor/\" title=\"azure-resourcemanager-monitor/\">azure-resourcemanager-monitor/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-msi/\" title=\"azure-resourcemanager-msi/\">azure-resourcemanager-msi/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mysql/\" title=\"azure-resourcemanager-mysql/\">azure-resourcemanager-mysql/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-mysqlflexibleserver/\" title=\"azure-resourcemanager-mysqlflexibleserver/\">azure-resourcemanager-mysqlflexibleserver/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-neonpostgres/\" title=\"azure-resourcemanager-neonpostgres/\">azure-resourcemanager-neonpostgres/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-netapp/\" title=\"azure-resourcemanager-netapp/\">azure-resourcemanager-netapp/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-network/\" title=\"azure-resourcemanager-network/\">azure-resourcemanager-network/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-networkanalytics/\" title=\"azure-resourcemanager-networkanalytics/\">azure-resourcemanager-networkanalytics/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-networkcloud/\" title=\"azure-resourcemanager-networkcloud/\">azure-resourcemanager-networkcloud/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-networkfunction/\" title=\"azure-resourcemanager-networkfunction/\">azure-resourcemanager-networkfunction/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-newrelicobservability/\" title=\"azure-resourcemanager-newrelicobservability/\">azure-resourcemanager-newrelicobservability/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-nginx/\" title=\"azure-resourcemanager-nginx/\">azure-resourcemanager-nginx/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-notificationhubs/\" title=\"azure-resourcemanager-notificationhubs/\">azure-resourcemanager-notificationhubs/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-oep/\" title=\"azure-resourcemanager-oep/\">azure-resourcemanager-oep/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-onlineexperimentation/\" title=\"azure-resourcemanager-onlineexperimentation/\">azure-resourcemanager-onlineexperimentation/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-operationsmanagement/\" title=\"azure-resourcemanager-operationsmanagement/\">azure-resourcemanager-operationsmanagement/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-oracledatabase/\" title=\"azure-resourcemanager-oracledatabase/\">azure-resourcemanager-oracledatabase/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-orbital/\" title=\"azure-resourcemanager-orbital/\">azure-resourcemanager-orbital/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-paloaltonetworks-ngfw/\" title=\"azure-resourcemanager-paloaltonetworks-ngfw/\">azure-resourcemanager-paloaltonetworks-ngfw/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-parent/\" title=\"azure-resourcemanager-parent/\">azure-resourcemanager-parent/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-peering/\" title=\"azure-resourcemanager-peering/\">azure-resourcemanager-peering/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-pineconevectordb/\" title=\"azure-resourcemanager-pineconevectordb/\">azure-resourcemanager-pineconevectordb/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-planetarycomputer/\" title=\"azure-resourcemanager-planetarycomputer/\">azure-resourcemanager-planetarycomputer/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-playwright/\" title=\"azure-resourcemanager-playwright/\">azure-resourcemanager-playwright/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-playwrighttesting/\" title=\"azure-resourcemanager-playwrighttesting/\">azure-resourcemanager-playwrighttesting/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-policyinsights/\" title=\"azure-resourcemanager-policyinsights/\">azure-resourcemanager-policyinsights/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-portalservicescopilot/\" title=\"azure-resourcemanager-portalservicescopilot/\">azure-resourcemanager-portalservicescopilot/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-postgresql/\" title=\"azure-resourcemanager-postgresql/\">azure-resourcemanager-postgresql/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-postgresqlflexibleserver/\" title=\"azure-resourcemanager-postgresqlflexibleserver/\">azure-resourcemanager-postgresqlflexibleserv.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-powerbidedicated/\" title=\"azure-resourcemanager-powerbidedicated/\">azure-resourcemanager-powerbidedicated/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-privatedns/\" title=\"azure-resourcemanager-privatedns/\">azure-resourcemanager-privatedns/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-providerhub/\" title=\"azure-resourcemanager-providerhub/\">azure-resourcemanager-providerhub/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-purestorageblock/\" title=\"azure-resourcemanager-purestorageblock/\">azure-resourcemanager-purestorageblock/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-purview/\" title=\"azure-resourcemanager-purview/\">azure-resourcemanager-purview/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-quantum/\" title=\"azure-resourcemanager-quantum/\">azure-resourcemanager-quantum/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-qumulo/\" title=\"azure-resourcemanager-qumulo/\">azure-resourcemanager-qumulo/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-quota/\" title=\"azure-resourcemanager-quota/\">azure-resourcemanager-quota/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-recoveryservices/\" title=\"azure-resourcemanager-recoveryservices/\">azure-resourcemanager-recoveryservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-recoveryservicesbackup/\" title=\"azure-resourcemanager-recoveryservicesbackup/\">azure-resourcemanager-recoveryservicesbackup/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-recoveryservicesdatareplication/\" title=\"azure-resourcemanager-recoveryservicesdatareplication/\">azure-resourcemanager-recoveryservicesdatare.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-recoveryservicessiterecovery/\" title=\"azure-resourcemanager-recoveryservicessiterecovery/\">azure-resourcemanager-recoveryservicessitere.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-redhatopenshift/\" title=\"azure-resourcemanager-redhatopenshift/\">azure-resourcemanager-redhatopenshift/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-redis/\" title=\"azure-resourcemanager-redis/\">azure-resourcemanager-redis/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-redisenterprise/\" title=\"azure-resourcemanager-redisenterprise/\">azure-resourcemanager-redisenterprise/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-relay/\" title=\"azure-resourcemanager-relay/\">azure-resourcemanager-relay/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-reservations/\" title=\"azure-resourcemanager-reservations/\">azure-resourcemanager-reservations/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resourceconnector/\" title=\"azure-resourcemanager-resourceconnector/\">azure-resourcemanager-resourceconnector/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resourcegraph/\" title=\"azure-resourcemanager-resourcegraph/\">azure-resourcemanager-resourcegraph/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resourcehealth/\" title=\"azure-resourcemanager-resourcehealth/\">azure-resourcemanager-resourcehealth/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resourcemover/\" title=\"azure-resourcemanager-resourcemover/\">azure-resourcemanager-resourcemover/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resources/\" title=\"azure-resourcemanager-resources/\">azure-resourcemanager-resources/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resources-bicep/\" title=\"azure-resourcemanager-resources-bicep/\">azure-resourcemanager-resources-bicep/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-resources-deploymentstacks/\" title=\"azure-resourcemanager-resources-deploymentstacks/\">azure-resourcemanager-resources-deploymentst.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-scvmm/\" title=\"azure-resourcemanager-scvmm/\">azure-resourcemanager-scvmm/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-search/\" title=\"azure-resourcemanager-search/\">azure-resourcemanager-search/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-secretsstoreextension/\" title=\"azure-resourcemanager-secretsstoreextension/\">azure-resourcemanager-secretsstoreextension/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-security/\" title=\"azure-resourcemanager-security/\">azure-resourcemanager-security/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-securitydevops/\" title=\"azure-resourcemanager-securitydevops/\">azure-resourcemanager-securitydevops/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-securityinsights/\" title=\"azure-resourcemanager-securityinsights/\">azure-resourcemanager-securityinsights/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-selfhelp/\" title=\"azure-resourcemanager-selfhelp/\">azure-resourcemanager-selfhelp/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-servicebus/\" title=\"azure-resourcemanager-servicebus/\">azure-resourcemanager-servicebus/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-servicefabric/\" title=\"azure-resourcemanager-servicefabric/\">azure-resourcemanager-servicefabric/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-servicefabricmanagedclusters/\" title=\"azure-resourcemanager-servicefabricmanagedclusters/\">azure-resourcemanager-servicefabricmanagedcl.../</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-servicelinker/\" title=\"azure-resourcemanager-servicelinker/\">azure-resourcemanager-servicelinker/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-servicenetworking/\" title=\"azure-resourcemanager-servicenetworking/\">azure-resourcemanager-servicenetworking/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-signalr/\" title=\"azure-resourcemanager-signalr/\">azure-resourcemanager-signalr/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-sitemanager/\" title=\"azure-resourcemanager-sitemanager/\">azure-resourcemanager-sitemanager/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-sphere/\" title=\"azure-resourcemanager-sphere/\">azure-resourcemanager-sphere/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-springappdiscovery/\" title=\"azure-resourcemanager-springappdiscovery/\">azure-resourcemanager-springappdiscovery/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-sql/\" title=\"azure-resourcemanager-sql/\">azure-resourcemanager-sql/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-sqlvirtualmachine/\" title=\"azure-resourcemanager-sqlvirtualmachine/\">azure-resourcemanager-sqlvirtualmachine/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-standbypool/\" title=\"azure-resourcemanager-standbypool/\">azure-resourcemanager-standbypool/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storage/\" title=\"azure-resourcemanager-storage/\">azure-resourcemanager-storage/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storageactions/\" title=\"azure-resourcemanager-storageactions/\">azure-resourcemanager-storageactions/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storagecache/\" title=\"azure-resourcemanager-storagecache/\">azure-resourcemanager-storagecache/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storagediscovery/\" title=\"azure-resourcemanager-storagediscovery/\">azure-resourcemanager-storagediscovery/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storageimportexport/\" title=\"azure-resourcemanager-storageimportexport/\">azure-resourcemanager-storageimportexport/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storagemover/\" title=\"azure-resourcemanager-storagemover/\">azure-resourcemanager-storagemover/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-storagepool/\" title=\"azure-resourcemanager-storagepool/\">azure-resourcemanager-storagepool/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-streamanalytics/\" title=\"azure-resourcemanager-streamanalytics/\">azure-resourcemanager-streamanalytics/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-subscription/\" title=\"azure-resourcemanager-subscription/\">azure-resourcemanager-subscription/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-support/\" title=\"azure-resourcemanager-support/\">azure-resourcemanager-support/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-synapse/\" title=\"azure-resourcemanager-synapse/\">azure-resourcemanager-synapse/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-terraform/\" title=\"azure-resourcemanager-terraform/\">azure-resourcemanager-terraform/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-test/\" title=\"azure-resourcemanager-test/\">azure-resourcemanager-test/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-timeseriesinsights/\" title=\"azure-resourcemanager-timeseriesinsights/\">azure-resourcemanager-timeseriesinsights/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-trafficmanager/\" title=\"azure-resourcemanager-trafficmanager/\">azure-resourcemanager-trafficmanager/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-trustedsigning/\" title=\"azure-resourcemanager-trustedsigning/\">azure-resourcemanager-trustedsigning/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-videoanalyzer/\" title=\"azure-resourcemanager-videoanalyzer/\">azure-resourcemanager-videoanalyzer/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-vmwarecloudsimple/\" title=\"azure-resourcemanager-vmwarecloudsimple/\">azure-resourcemanager-vmwarecloudsimple/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-voiceservices/\" title=\"azure-resourcemanager-voiceservices/\">azure-resourcemanager-voiceservices/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-webpubsub/\" title=\"azure-resourcemanager-webpubsub/\">azure-resourcemanager-webpubsub/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-weightsandbiases/\" title=\"azure-resourcemanager-weightsandbiases/\">azure-resourcemanager-weightsandbiases/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-workloadorchestration/\" title=\"azure-resourcemanager-workloadorchestration/\">azure-resourcemanager-workloadorchestration/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-workloads/\" title=\"azure-resourcemanager-workloads/\">azure-resourcemanager-workloads/</a>\n" +
                "                -         -      \n" +
                "<a href=\"azure-resourcemanager-workloadssapvirtualinstance/\" title=\"azure-resourcemanager-workloadssapvirtualinstance/\">azure-resourcemanager-workloadssapvirtualins.../</a>\n" +
                "                -         -      \n" +
                "\t\t\n" +
                "            </pre>\n" +
                "        </main>\n" +
                "        <hr/>\n" +
                "    </body>\n" +
                "</html>\n");
        Assertions.assertInstanceOf(MavenBranchPage.class, mavenPage);
    }
}
