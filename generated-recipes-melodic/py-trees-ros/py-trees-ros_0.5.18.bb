# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ros extensions and behaviours for py_trees."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/py_trees"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "py_trees_ros"

ROS_BUILD_DEPENDS = " \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    py-trees \
    py-trees-msgs \
    python-rospkg \
    python-termcolor \
    rosbag \
    rospy \
    sensor-msgs \
    std-msgs \
    unique-id \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    py-trees \
    python-qt-binding \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/melodic/py_trees_ros/0.5.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0ff816bf9f8ba3bd2919e5a01ab28bf3"
SRC_URI[sha256sum] = "1bc3f54d395458994329b16c3e3abff63702270a44e1443c5cafafe85a7362ac"
S = "${WORKDIR}/py_trees_ros-release-release-melodic-py_trees_ros-0.5.18-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/py-trees-ros/py-trees-ros_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/py-trees-ros/py-trees-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees-ros/py-trees-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees-ros/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
