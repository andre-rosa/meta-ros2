# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its runtime (e.g. running MoveIt! on robots)."
AUTHOR = "Isaac I. Y. Saito <gm130s@gmail.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "moveit_runtime"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-planners \
    moveit-plugins \
    moveit-ros-manipulation \
    moveit-ros-move-group \
    moveit-ros-perception \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    moveit-ros-warehouse \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_runtime/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6bb429dd4a970924045180987b449765"
SRC_URI[sha256sum] = "21850a909fa873a1590822fdb3c02425565e40dba912e501987eefb55858763a"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_runtime-1.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
