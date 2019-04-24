# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Test scripts to interface to the Dataspeed Inc. Power Distribution System (PDS)"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dataspeed_pds"
ROS_BPN = "dataspeed_pds_scripts"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dataspeed-pds-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_scripts/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6270e2bcf737af91cdd0241b3c6303fe"
SRC_URI[sha256sum] = "9affa7c314ddfe3804829e680b0889aef2e5b9b17c0ca0334cdf0b647ab9f666"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_scripts-1.0.2-0"

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
