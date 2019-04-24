# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "CAN bus tools using Dataspeed hardware"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dataspeed_can"
ROS_BPN = "dataspeed_can"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dataspeed-can-msg-filters \
    dataspeed-can-tools \
    dataspeed-can-usb \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can/1.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5c0d150118308c59a0fa73079f9724d2"
SRC_URI[sha256sum] = "db45e27927b4142df69eb0748d76e39125e9c76bae491a84fc04f8aa9e7528aa"
S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can-1.0.12-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('dataspeed-can', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('dataspeed-can', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-can/dataspeed-can_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-can/dataspeed-can-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-can/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dataspeed-can/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
