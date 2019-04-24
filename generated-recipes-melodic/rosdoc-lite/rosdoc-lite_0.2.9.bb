# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This ROS package wraps documentation tools like doxygen, sphinx,     and epydoc, making it convenient to generate ROS package     documentation.      It also generates online documentation for the ROS wiki."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rosdoc_lite"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    doxygen \
    genmsg \
    python-catkin-pkg \
    python-epydoc \
    python-kitchen \
    python-rospkg \
    python-sphinx \
    python-yaml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    doxygen \
    epydoc \
    genmsg \
    python-catkin-pkg \
    python-kitchen \
    python-rospkg \
    python-sphinx \
    python-yaml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosdoc_lite-release/archive/release/melodic/rosdoc_lite/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8dd1f2cae8577da7ffe827bcefe446b9"
SRC_URI[sha256sum] = "56baa614cb5b9b10171336c2a62470104cba4b85d16b8a4e952d1384fb4433ce"
S = "${WORKDIR}/rosdoc_lite-release-release-melodic-rosdoc_lite-0.2.9-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosdoc-lite/rosdoc-lite_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosdoc-lite/rosdoc-lite_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosdoc-lite/rosdoc-lite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosdoc-lite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosdoc-lite/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
