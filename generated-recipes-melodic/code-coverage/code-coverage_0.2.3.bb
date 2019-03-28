# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "CMake configuration to run coverage"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
HOMEPAGE = "https://github.com/mikeferguson/code_coverage"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "code_coverage"
ROS_BPN = "code_coverage"

ROS_BUILD_DEPENDS = " \
    lcov \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    lcov \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lcov \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mikeferguson/code_coverage-gbp/archive/release/melodic/code_coverage/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e2292ee3345fda73c9e6e3d1fccd0e56"
SRC_URI[sha256sum] = "aaf9d0b3b00d1b1af932e9099dbb3a92475ee92e45f189b3bfb3559e8abb1c50"
S = "${WORKDIR}/code_coverage-gbp-release-melodic-code_coverage-0.2.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('code-coverage', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('code-coverage', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/code-coverage/code-coverage_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/code-coverage/code-coverage-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/code-coverage/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/code-coverage/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}