# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "tf2_eigen"
AUTHOR = "Koji Terada <terakoji@gmail.com>"
ROS_AUTHOR = "Koji Terada"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry2"
ROS_BPN = "tf2_eigen"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_eigen/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3d534445c1cefa078f2a894170357c9c"
SRC_URI[sha256sum] = "0097c690bd551d83154cc551b7d50439d86e8acda2bc4ebc307d1157cdf8c24d"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_eigen-0.6.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('geometry2', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('geometry2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometry2/geometry2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometry2/geometry2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometry2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/geometry2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
