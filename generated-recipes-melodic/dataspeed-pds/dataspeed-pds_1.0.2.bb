# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Interface to the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dataspeed_pds"
ROS_BPN = "dataspeed_pds"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dataspeed-pds-can \
    dataspeed-pds-msgs \
    dataspeed-pds-scripts \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d59c4c90ca1e108bb24a54eb2af33460"
SRC_URI[sha256sum] = "d69d2b28ac8d0d207b3873acf559044a47c3b99d20fd20f01de6aa51cfe4feed"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds-1.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('dataspeed-pds', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('dataspeed-pds', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-pds/dataspeed-pds_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-pds/dataspeed-pds-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-pds/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-pds/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}