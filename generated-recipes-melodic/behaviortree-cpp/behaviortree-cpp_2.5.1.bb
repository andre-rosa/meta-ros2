# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides a behavior trees core."
AUTHOR = "Michele Colledanchise <michele.colledanchise@gmail.com>"
ROS_AUTHOR = "Michele Colledanchise"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "behaviortree_cpp"
ROS_BPN = "behaviortree_cpp"

ROS_BUILD_DEPENDS = " \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
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

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp-release/archive/release/melodic/behaviortree_cpp/2.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a76c4afa71eae8c65e4679e44d9b36d9"
SRC_URI[sha256sum] = "cd1af27ccb2e5763fa4e9f02e23edf77fca7d1894d013a0d932e7f5ad05d337c"
S = "${WORKDIR}/behaviortree_cpp-release-release-melodic-behaviortree_cpp-2.5.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('behaviortree-cpp', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('behaviortree-cpp', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/behaviortree-cpp/behaviortree-cpp_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/behaviortree-cpp/behaviortree-cpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/behaviortree-cpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/behaviortree-cpp/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
