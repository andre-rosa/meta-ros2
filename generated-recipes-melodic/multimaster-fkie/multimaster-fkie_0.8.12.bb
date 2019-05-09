# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The metapackage to combine the nodes required to establish and manage a multimaster network.      This requires no or minimal configuration. The changes are automatically detected and synchronized."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
ROS_AUTHOR = "Alexander Tiderko"
HOMEPAGE = "http://ros.org/wiki/multimaster_fkie"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "multimaster_fkie"
ROS_BPN = "multimaster_fkie"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    default-cfg-fkie \
    master-discovery-fkie \
    master-sync-fkie \
    multimaster-msgs-fkie \
    node-manager-fkie \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    default-cfg-fkie \
    master-discovery-fkie \
    master-sync-fkie \
    multimaster-msgs-fkie \
    node-manager-fkie \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "82473640513e84a84a934ea8d4542e51"
SRC_URI[sha256sum] = "1119b4d51db09a0811ca344110f064d21037ada2c8b35f8535b7b6986b996356"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_fkie-0.8.12-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('multimaster-fkie', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('multimaster-fkie', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/multimaster-fkie_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/multimaster-fkie-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
