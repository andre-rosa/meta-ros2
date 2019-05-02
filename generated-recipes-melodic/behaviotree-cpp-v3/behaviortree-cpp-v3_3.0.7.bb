# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the Behavior Trees core library."
AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "behaviortree_cpp_v3"

ROS_BUILD_DEPENDS = " \
    elfutils \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    elfutils \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    elfutils \
    roslib \
    zeromq \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp_v3-release/archive/release/melodic/behaviortree_cpp_v3/3.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d87c7dc6746f5f63e550c6ef91fdf062"
SRC_URI[sha256sum] = "fefe63e715f3e2c0e6b1a9a3b57848639f70576986a4f24d7b88a5d8e838b257"
S = "${WORKDIR}/behaviortree_cpp_v3-release-release-melodic-behaviortree_cpp_v3-3.0.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/behaviotree-cpp-v3/behaviotree-cpp-v3_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/behaviotree-cpp-v3/behaviotree-cpp-v3_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/behaviotree-cpp-v3/behaviotree-cpp-v3-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/behaviotree-cpp-v3/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/behaviotree-cpp-v3/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
