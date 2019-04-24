# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The prbt_ikfast_manipulator_plugin package"
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/prbt_ikfast_manipulator_plugin"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "pilz_robots"
ROS_BPN = "prbt_ikfast_manipulator_plugin"

ROS_BUILD_DEPENDS = " \
    liblapack-dev \
    moveit-core \
    pluginlib \
    roscpp \
    tf2-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    liblapack-dev \
    moveit-core \
    pluginlib \
    roscpp \
    tf2-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    liblapack-dev \
    moveit-core \
    pluginlib \
    roscpp \
    tf2-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    code-coverage \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_ikfast_manipulator_plugin/0.5.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e29d99ef20732b1b03de832d86620995"
SRC_URI[sha256sum] = "def4ff61fb9b4e80534735517fdada554eb01572558047e6b7c840f923c77766"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_ikfast_manipulator_plugin-0.5.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pilz-robots', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pilz-robots', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/pilz-robots-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pilz-robots/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
