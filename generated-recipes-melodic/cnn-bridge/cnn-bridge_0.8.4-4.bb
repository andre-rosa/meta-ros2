# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The cnn_bridge package take freeze graphs and publishes them as ROS messages"
AUTHOR = "Noam C. Golombek <ngolombek@gmail.com>"
ROS_AUTHOR = "Noam C. Golombek <ngolombek@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cnn_bridge"
ROS_BPN = "cnn_bridge"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wew84/cnn_bridge-release/archive/release/melodic/cnn_bridge/0.8.4-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c8995c23d4c52e2115d2b2d7d7b8e902"
SRC_URI[sha256sum] = "b4ab64c311dabba4a3ea3c43aa6909af251a42e6bfa479f426d2a79e613e6596"
S = "${WORKDIR}/cnn_bridge-release-release-melodic-cnn_bridge-0.8.4-4"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cnn-bridge', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cnn-bridge', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cnn-bridge/cnn-bridge_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cnn-bridge/cnn-bridge-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cnn-bridge/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cnn-bridge/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}