# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "Michael Görner <me@v4hn.de>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_commander"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    moveit-msgs \
    moveit-ros-planning-interface \
    python-pyassimp \
    rospy \
    sensor-msgs \
    shape-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    moveit-resources \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_commander/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "edffddcadb0514fe49d21d63378e56c7"
SRC_URI[sha256sum] = "ea3303f2603691866e92db0d35a0491c179d9c68bbabe6b6c251928bd8614e53"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_commander-1.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('moveit', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('moveit', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
