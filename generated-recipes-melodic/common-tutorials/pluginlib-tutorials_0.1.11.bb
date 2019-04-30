# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib_tutorials package"
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/pluginlib/Tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/pluginlib_tutorials/0.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b69da7ebfc00a157529fab2e5a8cdbbb"
SRC_URI[sha256sum] = "2a421d7ea4d04ba27c7221abd753f1ebbe040227df1e4c87a3df559064002c17"
S = "${WORKDIR}/common_tutorials-release-release-melodic-pluginlib_tutorials-0.1.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/common-tutorials/common-tutorials_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/common-tutorials/common-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/common-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/common-tutorials/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
