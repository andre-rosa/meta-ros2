# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The Extensible Optimization Toolset (EXOTica) is a library for defining problems for robot motion planning."
AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
ROS_AUTHOR = "Michael Camilleri"
HOMEPAGE = "https://github.com/ipab-slmc/exotica"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_core"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    kdl-parser \
    libtinyxml2 \
    message-runtime \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_core/5.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "292a502a78a558f851cb37d46b690751"
SRC_URI[sha256sum] = "c5f91ca156ad37a8357e9b650c39fab45ea4327bf1a4a645f1bdc2bcde2e59fc"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_core-5.0.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('exotica', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('exotica', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/exotica_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/exotica-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/exotica/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
