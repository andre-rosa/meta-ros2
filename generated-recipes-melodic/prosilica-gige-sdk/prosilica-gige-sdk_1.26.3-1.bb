# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "AVT GigE SDK version 1.26 for ROS"
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Allied Vision Technologies."
HOMEPAGE = "http://www.ros.org/wiki/prosilica_gige_sdk"
SECTION = "devel"
LICENSE = "Commercial"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=89ece75825a8b55d703b3728166a0fc7"

ROS_CN = "prosilica_gige_sdk"
ROS_BPN = "prosilica_gige_sdk"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-drivers-gbp/prosilica_gige_sdk-release/archive/release/melodic/prosilica_gige_sdk/1.26.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "859886d255d3b1055ebbf5448b801564"
SRC_URI[sha256sum] = "3ba1f4695e70b0a8d831ec38c0e76b5d018e589d74cbf0436c828ce934e0ab3d"
S = "${WORKDIR}/prosilica_gige_sdk-release-release-melodic-prosilica_gige_sdk-1.26.3-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('prosilica-gige-sdk', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('prosilica-gige-sdk', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/prosilica-gige-sdk/prosilica-gige-sdk_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/prosilica-gige-sdk/prosilica-gige-sdk-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/prosilica-gige-sdk/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/prosilica-gige-sdk/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
